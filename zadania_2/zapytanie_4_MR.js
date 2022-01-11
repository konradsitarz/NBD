db.people.mapReduce(
    function () {
        emit(this.nationality, { weight: this.weight, height: this.height });
    },
    function (key, values) {
        let sumBmi = 0;
        let heighestBmi = 0;
        let lowestBmi = Infinity;

        values.forEach(person => {
            const heightInMeters = parseFloat(person.height) / 100;
            const bmi = parseFloat(person.weight) / (heightInMeters * heightInMeters);

            sumBmi += bmi;
            if (bmi > heighestBmi) heighestBmi = bmi;
            if (bmi < lowestBmi) lowestBmi = bmi;
        });

        return { averageBmi: sumBmi / values.length, heighestBmi, lowestBmi };
    },
    { out: 'bmi' }
);

printjson(db.bmi.find().toArray());
