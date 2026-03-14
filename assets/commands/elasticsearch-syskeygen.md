# TAGLINE

Generate Elasticsearch system encryption key

# TLDR

**Generate system key**

```elasticsearch-syskeygen```

# SYNOPSIS

**elasticsearch-syskeygen** [_options_]

# DESCRIPTION

**elasticsearch-syskeygen** creates a **system_key** file in the Elasticsearch configuration directory. This key is used to symmetrically encrypt sensitive data, such as preventing Watcher from returning and storing information that contains clear text credentials.

# CAVEATS

This tool is part of X-Pack. The generated system key must be the same across all nodes in a cluster. Use **elasticsearch-keystore** for managing secure settings in newer versions.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-keystore](/man/elasticsearch-keystore)(1)

