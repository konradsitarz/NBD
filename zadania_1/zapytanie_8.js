db.people.updateMany(
    { 'location.city': 'Moscow' },
    { '$set': { 'location.city': 'Moskwa' } }
);

JSON.stringify(db.people.find({ 'location.city': 'Moskwa' }).toArray())