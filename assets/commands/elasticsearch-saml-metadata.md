# TAGLINE

Generate SAML Service Provider metadata

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
> SAML realm to describe. Required when more than one SAML realm is configured.

**--out** _file_
> Output file path. Defaults to saml-elasticsearch-metadata.xml.

**--batch**
> Run without prompting for input.

**--attribute** _name_
> Add a `<RequestedAttribute>` element for the named attribute. Repeatable.

**--service-name** _name_
> Value for `<ServiceName>`. Defaults to "elasticsearch".

**--locale** _name_
> Locale used for the metadata elements. Defaults to the JVM locale.

**--contacts**
> Prompt for and include `<ContactPerson>` elements.

**--organisation-name** _name_
> Include an `<Organization>` element with this name.

**--organisation-display-name** _name_
> Display name for the organization.

**--organisation-url** _url_
> URL for the organization.

**--signing-cert** _file_
> PEM certificate used to sign the metadata.

**--signing-key** _file_
> PEM private key matching the signing certificate.

**--signing-key-password** _password_
> Password protecting the signing key.

**--signing-bundle** _file_
> PKCS#12 file holding the signing key pair, as an alternative to the cert/key pair.

**-E** _setting=value_
> Configure an Elasticsearch setting.

# DESCRIPTION

**elasticsearch-saml-metadata** generates the SAML Service Provider metadata document that an Identity Provider needs in order to trust Elasticsearch. It reads the SAML realm configuration from elasticsearch.yml and writes the entity ID, the assertion consumer service URL, and the single logout endpoints into an XML file that can be handed to the IdP administrator.

The realm must already be configured before running the command: the tool describes what is in the configuration, it does not create it.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-users](/man/elasticsearch-users)(1)

# RESOURCES

```[Source code](https://github.com/elastic/elasticsearch)```

```[Homepage](https://www.elastic.co/elasticsearch)```

```[Documentation](https://www.elastic.co/docs/reference/elasticsearch/command-line-tools/saml-metadata)```

<!-- verified: 2026-07-14 -->

