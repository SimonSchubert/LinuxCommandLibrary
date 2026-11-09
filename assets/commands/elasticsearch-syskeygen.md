# TAGLINE

Generate Elasticsearch system encryption key

# TLDR

**Generate system key**

```elasticsearch-syskeygen```

# SYNOPSIS

**elasticsearch-syskeygen** [_options_]

# PARAMETERS

**-E** _setting_=_value_
> Configure a setting.

**-h**, **--help**
> Show all command parameters.

**-s**, **--silent**
> Show minimal output.

**-v**, **--verbose**
> Show verbose output.

# DESCRIPTION

**elasticsearch-syskeygen** creates a **system_key** file in the Elasticsearch configuration directory. This key is used to symmetrically encrypt sensitive data, such as preventing Watcher from returning and storing information that contains clear text credentials.

# CAVEATS

The system key is symmetric, so the same key must be used on every node in the cluster. To encrypt Watcher data, load the file into the keystore with **elasticsearch-keystore add-file xpack.watcher.encryption_key** _path_/system_key on each node, then delete the system_key file.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-keystore](/man/elasticsearch-keystore)(1)

# RESOURCES

```[Source code](https://github.com/elastic/elasticsearch)```

```[Homepage](https://www.elastic.co/elasticsearch)```

```[Documentation](https://www.elastic.co/docs/reference/elasticsearch/command-line-tools/syskeygen)```

<!-- verified: 2026-11-09 -->
