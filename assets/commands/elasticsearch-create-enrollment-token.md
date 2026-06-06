# TAGLINE

Generate enrollment tokens for nodes and Kibana

# TLDR

**Create token for new node**

```elasticsearch-create-enrollment-token -s node```

**Create token for Kibana**

```elasticsearch-create-enrollment-token -s kibana```

**Specify URL**

```elasticsearch-create-enrollment-token -s node --url [https://localhost:9200]```

# SYNOPSIS

**elasticsearch-create-enrollment-token** **-s** _scope_ [_options_]

# PARAMETERS

**-s**, **--scope** _scope_
> Scope of the generated token: `node` or `kibana`.

**--url** _url_
> Base URL (hostname and port) used to submit API requests. Defaults to the value derived from elasticsearch.yml.

**-f**, **--force**
> Force the command to run against an unhealthy cluster.

**-E** _setting=value_
> Configure the specified Elasticsearch setting for the duration of the command.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**elasticsearch-create-enrollment-token** generates enrollment tokens used to add new Elasticsearch nodes to an existing cluster or to configure a Kibana instance to communicate with a security-enabled cluster.

Tokens are short-lived and expire 30 minutes after they are generated. The command must be run from the Elasticsearch installation directory (typically `bin/elasticsearch-create-enrollment-token`).

# CAVEATS

Only works with clusters that were auto-configured for security (the default in Elasticsearch 8.0 and later). Generated tokens expire after 30 minutes. Requires a running, healthy node unless `--force` is given.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-reset-password](/man/elasticsearch-reset-password)(1)

