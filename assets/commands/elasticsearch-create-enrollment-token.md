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
> Token scope (node or kibana).

**--url** _url_
> Elasticsearch URL.

**-E** _setting=value_
> Configure setting.

# DESCRIPTION

**elasticsearch-create-enrollment-token** generates enrollment tokens for adding new Elasticsearch nodes or connecting Kibana to a secured cluster.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-reset-password](/man/elasticsearch-reset-password)(1)

