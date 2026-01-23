# TLDR

**List all OpenSearch domains**

```aws opensearch list-domain-names```

**Describe a domain**

```aws opensearch describe-domain --domain-name [domain_name]```

**Get domain configuration**

```aws opensearch describe-domain-config --domain-name [domain_name]```

**Create a new domain**

```aws opensearch create-domain --domain-name [domain_name] --engine-version OpenSearch_2.11 --cluster-config InstanceType=t3.small.search,InstanceCount=1```

**Update domain configuration**

```aws opensearch update-domain-config --domain-name [domain_name] --cluster-config InstanceType=r6g.large.search```

**Delete a domain**

```aws opensearch delete-domain --domain-name [domain_name]```

**List available engine versions**

```aws opensearch list-versions```

**Get upgrade history**

```aws opensearch get-upgrade-history --domain-name [domain_name]```

# SYNOPSIS

**aws opensearch** _subcommand_ [_options_]

# DESCRIPTION

**aws opensearch** is a subcommand of the AWS CLI that manages Amazon OpenSearch Service, a managed search and analytics engine. It is the successor to Amazon Elasticsearch Service and is compatible with OpenSearch and legacy Elasticsearch APIs.

OpenSearch domains are clusters that run the OpenSearch engine. Each domain has a cluster configuration (instance types, counts), storage settings (EBS volumes), access policies, and optional features like fine-grained access control and encryption.

The service supports use cases including log analytics, full-text search, application monitoring, and SIEM. OpenSearch Dashboards provides visualization capabilities.

# PARAMETERS

**list-domain-names**
> List all domains in the account.

**describe-domain**
> Get domain status and configuration.

**describe-domain-config**
> Get detailed configuration settings.

**create-domain**
> Create a new OpenSearch domain.

**update-domain-config**
> Modify domain settings.

**delete-domain**
> Remove a domain.

**list-versions**
> List available OpenSearch and Elasticsearch versions.

**upgrade-domain**
> Initiate a version upgrade.

**get-upgrade-status**
> Check upgrade progress.

**--domain-name** _name_
> Name of the domain.

**--engine-version** _version_
> OpenSearch or Elasticsearch version.

**--cluster-config** _config_
> Instance type, count, and zone awareness.

**--ebs-options** _options_
> EBS volume configuration.

**--access-policies** _json_
> Resource-based access policy.

**--vpc-options** _options_
> VPC configuration for private domains.

**--encryption-at-rest-options** _options_
> Enable encryption at rest.

# CAVEATS

Domain names must be lowercase and unique within a region. Configuration changes can take 15-30 minutes to apply. Domains in a VPC cannot be made public later. Version upgrades may require blue/green deployment. Fine-grained access control requires HTTPS and node-to-node encryption. Deleting a domain permanently removes all data.

# HISTORY

**Amazon Elasticsearch Service** launched in **October 2015** as a managed Elasticsearch offering. Following the Elasticsearch license change, AWS forked the project and rebranded the service as **Amazon OpenSearch Service** in **September 2021**, based on the open-source OpenSearch project. The service has added features like UltraWarm storage tiers, serverless collections, and vector search for AI applications.

# SEE ALSO

[aws](/man/aws)(1), [curl](/man/curl)(1), [aws-logs](/man/aws-logs)(1), [aws-firehose](/man/aws-firehose)(1)
