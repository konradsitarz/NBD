db.people.mapReduce(
    function () {
      this.credit.forEach(cc => {
        emit(cc.currency, cc.balance);
      });
    },
    function (key, values) {
      const sumBalance = Array.sum(
          values.map(parseFloat));
      const averageBalance = sumBalance / values.length;
  
      return { sumBalance, averageBalance };
    },
    {
      query: {
        nationality: 'Poland',
        sex: 'Female'
      },
      out: 'polish_women_balances'
    }
  );
printjson(db.polish_women_balances.find().toArray())