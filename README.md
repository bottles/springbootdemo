# springbootdemo
for summer project
execute 
create (le:Student {firstname:"Alice"}), (db:Student {firstname:"Bob"}), (le)-[:KNOWS]->(db) return le, db
on neo4j to test
