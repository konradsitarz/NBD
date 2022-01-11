db.people.insert(
    {
    "sex": "Male",
    "first_name": "Konrad",
    "last_name": "Sitarz",
    "job": "Data scientist",
    "email": "sitarzkonrad@gmail.com",
    "location": {
        "city": "Warsaw",
        "address": {
            "streetname": "Wiejska",
            "streetnumber": "10"
        }
    },
    "description": "I don't have idea what I'm doing",
    "height": "180",
    "weight": "75",
    "birth_date": "1996-01-02T11:33:11Z",
    "nationality": "Poland",
    "credit": [{
        "type": "switch",
        "number": "12345676",
        "currency": "PLN",
        "balance": "12345670.0"
    }]
}
);
JSON.stringify(db.people.findOne({'first_name':'Konrad', 'last_name': 'Sitarz'}))