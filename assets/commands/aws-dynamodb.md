# TAGLINE

Manage tables and items in Amazon DynamoDB.

# TLDR

**Create a table** with a partition key

```aws dynamodb create-table --table-name [my-table] --attribute-definitions AttributeName=id,AttributeType=S --key-schema AttributeName=id,KeyType=HASH --billing-mode PAY_PER_REQUEST```

**Put an item** into a table

```aws dynamodb put-item --table-name [my-table] --item '{"id": {"S": "[item-id]"}, "name": {"S": "[value]"}}'```

**Get an item** by primary key

```aws dynamodb get-item --table-name [my-table] --key '{"id": {"S": "[item-id]"}}'```

**Query items** by partition key

```aws dynamodb query --table-name [my-table] --key-condition-expression "id = :id" --expression-attribute-values '{":id": {"S": "[item-id]"}}'```

**Scan all items** in a table

```aws dynamodb scan --table-name [my-table]```

**Update an item** attribute

```aws dynamodb update-item --table-name [my-table] --key '{"id": {"S": "[item-id]"}}' --update-expression "SET #n = :val" --expression-attribute-names '{"#n": "name"}' --expression-attribute-values '{":val": {"S": "[new-value]"}}'```

**Delete an item** by key

```aws dynamodb delete-item --table-name [my-table] --key '{"id": {"S": "[item-id]"}}'```

# SYNOPSIS

**aws dynamodb** _command_ [_options_]

# DESCRIPTION

**aws dynamodb** is the AWS CLI interface for Amazon DynamoDB, a fully managed NoSQL key-value and document database. DynamoDB provides single-digit millisecond performance at any scale with built-in security, backup, and in-memory caching.

Tables store items identified by primary keys (partition key, or partition + sort key). DynamoDB supports on-demand and provisioned capacity modes, global tables for multi-region replication, and transactions for ACID operations.

# COMMANDS

**create-table**
> Create a new DynamoDB table

**delete-table**
> Delete a table

**describe-table**
> Get table metadata and status

**put-item**
> Insert or replace an item

**get-item**
> Retrieve an item by primary key

**update-item**
> Modify item attributes

**delete-item**
> Remove an item by primary key

**query**
> Retrieve items by partition key with optional filtering

**scan**
> Read all items in a table

**batch-write-item**
> Write or delete multiple items across tables

**transact-write-items**
> Execute multiple writes atomically

# CAVEATS

Item size is limited to 400KB. Scan operations read the entire table and can be expensive on large tables. Query is preferred over scan for performance. Provisioned capacity can lead to throttling if exceeded. Eventually consistent reads are the default; strongly consistent reads cost more.

# HISTORY

Amazon DynamoDB launched in **January 2012** as a successor to SimpleDB. Global Tables for multi-region replication came in **2017**, on-demand capacity mode in **2018**, and PartiQL query language support in **2020**. It remains one of AWS's most widely used database services.

# SEE ALSO

[aws](/man/aws)(1), [aws-dynamodbstreams](/man/aws-dynamodbstreams)(1), [aws-rds](/man/aws-rds)(1)
