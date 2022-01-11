JSON.stringify(db.people.aggregate([
    { $match: { nationality: "Poland", sex: "Female" } },
    { $unwind: "$credit" },
    {
        $group: {
            _id: "$credit.currency",
            avg: { $avg: { $convert: { input: "$credit.balance", to: "double" } } },
            sum: { $sum: { $convert: { input: "$credit.balance", to: "double" } } }
        }
    }
]).toArray())