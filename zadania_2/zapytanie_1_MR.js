db.people.mapReduce(
    function () {
        emit(this.sex, { weight: this.weight, height: this.height });
    },

    function (_, values) {
        let weight = 0;
        let height = 0;
        let counter = 0;

        values.forEach(element => {
            weight += parseFloat(element.weight);
            height += parseFloat(element.height);
            counter += 1;
        });

        return {
            averageWeight: weight / counter,
            averageHeight: height / counter
        };
    },
    { out: 'result' }
);

JSON.stringify(db.result.find().toArray());