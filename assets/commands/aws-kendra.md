# TLDR

**Create a new Kendra index**

```aws kendra create-index --name [my-index] --role-arn [arn:aws:iam::account:role/kendra-role]```

**List all indexes** in the account

```aws kendra list-indices```

**Submit a search query**

```aws kendra query --index-id [index-id] --query-text "[search terms]"```

**Add documents** to an index

```aws kendra batch-put-document --index-id [index-id] --documents file://[documents.json]```

**Create a data source** connector

```aws kendra create-data-source --index-id [index-id] --name [s3-source] --type S3 --configuration file://[s3-config.json] --role-arn [arn:aws:iam::account:role/kendra-role]```

**Start a data source sync**

```aws kendra start-data-source-sync-job --index-id [index-id] --id [data-source-id]```

**Create a FAQ** for direct answers

```aws kendra create-faq --index-id [index-id] --name [my-faq] --s3-path Bucket=[bucket],Key=[faq.csv] --role-arn [arn:aws:iam::account:role/kendra-role]```

# SYNOPSIS

**aws kendra** _command_ [_options_]

# DESCRIPTION

**aws kendra** is the AWS CLI interface for Amazon Kendra, an intelligent enterprise search service powered by machine learning. Kendra provides natural language search capabilities across documents, FAQs, and other content sources.

Kendra indexes documents from various data sources including S3, SharePoint, Salesforce, ServiceNow, and databases. It understands natural language queries and returns relevant passages with highlighted answers, supporting semantic search beyond keyword matching.

# COMMANDS

**create-index**
> Create a new search index

**delete-index**
> Delete an index

**list-indices**
> List all indexes

**query**
> Submit a search query

**batch-put-document**
> Add documents to an index

**batch-delete-document**
> Remove documents from an index

**create-data-source**
> Create a connector to external content

**start-data-source-sync-job**
> Trigger document synchronization

**create-faq**
> Add FAQ content for direct answers

**get-query-suggestions**
> Get autocomplete suggestions

# CAVEATS

Index creation takes 15-30 minutes. Document ingestion costs apply per document scanned. Query capacity units (QCUs) determine concurrent query limits. Large document processing can be slow; use data sources for bulk content. Enterprise edition required for advanced features.

# HISTORY

Amazon Kendra launched in **December 2019** as an ML-powered enterprise search service. Query suggestions were added in **2021**, and featured results for promoted content in **2022**. The service has expanded data source connectors to support over 14 content repositories.

# SEE ALSO

[aws](/man/aws)(1), [aws-opensearch](/man/aws-opensearch)(1)
