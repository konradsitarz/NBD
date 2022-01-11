JSON.stringify(
    db.people.aggregate([
        { $unwind: "$credit" },
        {
            $group: {
                _id: "$credit.currency",
                sum: { $sum: {$convert: {input: "$credit.balance", to: "double"}}}

            }
        }
    ]).toArray()
)