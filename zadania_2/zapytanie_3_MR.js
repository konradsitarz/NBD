db.people.mapReduce(
    function () {
        emit(this.job, null);
    },
    function (key, values) {
        return 1;
    },
    {
        out: 'results'
    }
)

JSON.stringify(db.results.find().toArray());