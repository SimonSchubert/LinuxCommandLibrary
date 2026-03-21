# TAGLINE

manage Elasticsearch within Cradle framework

# TLDR

**Start Elasticsearch** with Cradle

```cradle elastic start```

**Stop Elasticsearch**

```cradle elastic stop```

**Check status** of Elasticsearch

```cradle elastic status```

**Flush** Elasticsearch indices

```cradle elastic flush```

**Map** Elasticsearch schema

```cradle elastic map```

# SYNOPSIS

**cradle** **elastic** _command_ [_options_]

# PARAMETERS

**start**
> Start the Elasticsearch service for the Cradle development environment.

**stop**
> Stop the running Elasticsearch service.

**status**
> Display the current status of the Elasticsearch service.

**flush**
> Flush all Elasticsearch indices, clearing cached data.

**map**
> Apply schema mappings to Elasticsearch indices.

# DESCRIPTION

**cradle elastic** manages Elasticsearch instances within the Cradle PHP framework. It provides commands to start, stop, and check the status of Elasticsearch services for development environments.

This tool simplifies local Elasticsearch management by handling service lifecycle operations through the Cradle CLI. It's particularly useful for developers who need Elasticsearch running locally for search functionality testing without manually managing the service.

Part of the Cradle framework's integrated service management tools that allow developers to control dependencies directly from the framework CLI.

# SEE ALSO

[cradle](/man/cradle)(1), [cradle-install](/man/cradle-install)(1), [cradle-sql](/man/cradle-sql)(1), [elasticsearch](/man/elasticsearch)(1)
