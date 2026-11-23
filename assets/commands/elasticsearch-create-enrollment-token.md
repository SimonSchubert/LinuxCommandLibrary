# TAGLINE

Generate enrollment tokens for nodes and Kibana

# TLDR

**Create token for new node**

```elasticsearch-create-enrollment-token -s node```

**Create token for Kibana**

```elasticsearch-create-enrollment-token -s kibana```

**Specify the URL of the local node**

```elasticsearch-create-enrollment-token -s kibana --url "[https://172.0.0.3:9200]"```

**Run against an unhealthy cluster**

```elasticsearch-create-enrollment-token -s node --force```

**Create a Kibana token inside a Docker container**

```docker exec -it [es01] /usr/share/elasticsearch/bin/elasticsearch-create-enrollment-token -s kibana```

# SYNOPSIS

**elasticsearch-create-enrollment-token** [**-f**] [**-h**] [**-E** _setting_=_value_] [**-s** _scope_] [**--url** _url_]

# PARAMETERS

**-s**, **--scope** _scope_
> Scope of the generated token: `node` or `kibana`.

**--url** _url_
> Base URL (hostname and port of the local node) used to submit API requests. Defaults to the value derived from elasticsearch.yml. Must be HTTPS if **xpack.security.http.ssl.enabled** is true.

**-f**, **--force**
> Force the command to run against an unhealthy cluster.

**-E** _setting=value_
> Override an Elasticsearch or X-Pack setting from elasticsearch.yml for this command.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**elasticsearch-create-enrollment-token** generates enrollment tokens used to add new Elasticsearch nodes to an existing cluster (with `elasticsearch --enrollment-token`) or to configure a Kibana instance to communicate with a security-enabled cluster.

To issue the request, the tool creates a temporary user in the file realm and removes it afterwards. It connects over HTTP(S) using the **xpack.security.http.ssl** settings from elasticsearch.yml. If a non-default configuration directory is used, set **ES_PATH_CONF** accordingly before running it. The tool is located in the **bin/** directory of the Elasticsearch installation (**/usr/share/elasticsearch/bin/** for package and Docker installs).

# CAVEATS

Only works with clusters that were auto-configured for security (the default in Elasticsearch 8.0 and later), and fails if the file realm is disabled in elasticsearch.yml. Generated tokens expire after 30 minutes. Requires a running, healthy node unless **--force** is given.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-reset-password](/man/elasticsearch-reset-password)(1), [elasticsearch-certutil](/man/elasticsearch-certutil)(1), [elasticsearch-node](/man/elasticsearch-node)(1)

# RESOURCES

```[Documentation](https://www.elastic.co/docs/reference/elasticsearch/command-line-tools/create-enrollment-token)```

```[Source code](https://github.com/elastic/elasticsearch)```

<!-- verified: 2026-11-23 -->
