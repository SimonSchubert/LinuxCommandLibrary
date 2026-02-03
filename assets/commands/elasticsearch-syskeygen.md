# TLDR

**Generate system key**

```elasticsearch-syskeygen```

# SYNOPSIS

**elasticsearch-syskeygen** [_options_]

# DESCRIPTION

**elasticsearch-syskeygen** generates the system key used by Elasticsearch for encrypting sensitive data. The system key is stored in the Elasticsearch configuration directory.

# CAVEATS

This tool is deprecated in newer Elasticsearch versions. Use elasticsearch-keystore for managing secure settings.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-keystore](/man/elasticsearch-keystore)(1)

