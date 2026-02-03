# TLDR

**Generate SAML metadata**

```elasticsearch-saml-metadata```

**Specify realm name**

```elasticsearch-saml-metadata --realm [realm_name]```

**Output to file**

```elasticsearch-saml-metadata --out [metadata.xml]```

**With signing certificate**

```elasticsearch-saml-metadata --signing-cert [cert.pem] --signing-key [key.pem]```

# SYNOPSIS

**elasticsearch-saml-metadata** [_options_]

# PARAMETERS

**--realm** _name_
> SAML realm name.

**--out** _file_
> Output file path.

**--signing-cert** _file_
> Signing certificate.

**--signing-key** _file_
> Signing key.

**--contacts**
> Include contact info.

# DESCRIPTION

**elasticsearch-saml-metadata** generates SAML Service Provider metadata for Elasticsearch. Used when configuring SAML authentication with an Identity Provider.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1)

