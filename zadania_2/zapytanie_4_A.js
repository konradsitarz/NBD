JSON.stringify(
    db.people.aggregate([
        {
            $group: {
                _id: "$nationality",
                avg_bmi: {
                    $avg: {
                        $divide:
                            [
                                { $convert: { input: "$weight", to: "double" } },
                                { $pow: [{ $divide: [{ $convert: { input: "$height", to: "double" } }, 100] }, 2] }]
                    }
                },
                max_bmi: {
                    $max: {
                        $divide:
                            [
                                { $convert: { input: "$weight", to: "double" } },
                                { $pow: [{ $divide: [{ $convert: { input: "$height", to: "double" } }, 100] }, 2] }]
                    }
                },
                min_bmi: {
                    $min: {
                        $divide:
                            [
                                { $convert: { input: "$weight", to: "double" } },
                                { $pow: [{ $divide: [{ $convert: { input: "$height", to: "double" } }, 100] }, 2] }]
                    }
                }
            }
        }]).toArray()
)