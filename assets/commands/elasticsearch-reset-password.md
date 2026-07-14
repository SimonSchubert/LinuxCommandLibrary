# TAGLINE

Reset passwords for built-in Elasticsearch users

# TLDR

**Reset elastic user password**

```elasticsearch-reset-password -u elastic```

**Reset with auto-generated password**

```elasticsearch-reset-password -u [username] -a```

**Reset interactively**

```elasticsearch-reset-password -u [username] -i```

**Specify batch mode**

```elasticsearch-reset-password -u [username] -b```

# SYNOPSIS

**elasticsearch-reset-password** **-u** _username_ [_options_]

# PARAMETERS

**-u**, **--username** _user_
> Username to reset.

**-a**, **--auto**
> Reset the password to an auto-generated strong password. This is the default.

**-i**, **--interactive**
> Prompt for the new password instead of generating one.

**-b**, **--batch**
> Run without prompting for confirmation.

**-f**, **--force**
> Run even against an unhealthy cluster.

**--url** _url_
> Base URL for the Elasticsearch API. Defaults to the value derived from elasticsearch.yml.

**-E** _setting=value_
> Configure a standard Elasticsearch or X-Pack setting.

**-s**, **--silent**
> Show minimal output.

**-v**, **--verbose**
> Show verbose output.

# DESCRIPTION

**elasticsearch-reset-password** resets the password of a native realm user or one of the built-in users such as **elastic** or **kibana_system**. It is the recommended way to recover access when the elastic password is lost.

The tool must be run on a node of the cluster, as the user that owns the Elasticsearch files, and it needs the cluster to be running. Without **-i** it prints a freshly generated password to the console; that output is the only time the password is shown.

# CAVEATS

Only works when the Elasticsearch security features are enabled, which is the default from version 8. The command talks to the cluster over HTTPS, so a cluster that is down or unreachable cannot have its passwords reset unless **-f** is used against an unhealthy but running cluster.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-users](/man/elasticsearch-users)(1)

# RESOURCES

```[Source code](https://github.com/elastic/elasticsearch)```

```[Homepage](https://www.elastic.co/elasticsearch)```

```[Documentation](https://www.elastic.co/docs/reference/elasticsearch/command-line-tools/reset-password)```

<!-- verified: 2026-07-14 -->

