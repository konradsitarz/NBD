import riak

riakClient = riak.RiakClient(pb_port=8087)

bucket = riakClient.bucket('s24054')

# 1. dodanie
zibi = {"zibi": "top", "nr": 1}
key = bucket.new('player', data=zibi)
key.store()
print('New object')


# pobranie i wypisanie
res = bucket.get('player')
print('Updated object: ' + str(res.data))


# modyfikacja
res.data['nr'] = 9999
res.store()

res_2 = bucket.get('player')
print('Get player: ' + str(res_2.data))


# usuwanie
res_2.delete()
print('Object deleted.')
res_3 = bucket.get('player')
print('Get player: ' + str(res_3.data))
