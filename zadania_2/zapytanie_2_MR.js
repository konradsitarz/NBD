db.people.mapReduce(
    function () {
        this.credit.forEach(element => {
            emit(element.currency, parseFloat(element.balance));
        });
    },

    function (_, values) {
        return Array.sum(values);
    },

    { out: 'result' }
);

JSON.stringify(db.result.find().toArray());