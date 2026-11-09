# TAGLINE

manage Elasticsearch data within Cradle framework

# TLDR

**Show available** Elasticsearch commands

```cradle elastic```

**Truncate** the Elasticsearch index

```cradle elastic flush```

**Truncate** the index for a specific package

```cradle elastic flush [vendor/package]```

**Submit** the Elasticsearch schema

```cradle elastic map```

**Submit** the schema for a specific package

```cradle elastic map [vendor/package]```

**Populate** the Elasticsearch indices

```cradle elastic populate```

**Populate** the indices for a specific package

```cradle elastic populate [vendor/package]```

# SYNOPSIS

**cradle** **elastic** [_command_] [_vendor/package_]

# PARAMETERS

**flush** [_package_]
> Truncate the entire index, optionally for one package.

**map** [_package_]
> Submit the Elasticsearch schema, optionally for one package.

**populate** [_package_]
> Populate the Elasticsearch indices, optionally for one package.

**help**
> Show the Elasticsearch commands.

# DESCRIPTION

**cradle elastic** manages the Elasticsearch data of a Cradle PHP framework instance from the Cradle command-line tool. It can clear an index, submit the schema, and populate indices, either for all packages or for a single named package.

# CAVEATS

**cradle elastic** does not start or stop an Elasticsearch server; the service has to be running and configured for the Cradle project. The main Cradle repository has had no commits since 2022.

# SEE ALSO

[cradle](/man/cradle)(1), [cradle-install](/man/cradle-install)(1), [cradle-sql](/man/cradle-sql)(1), [elasticsearch](/man/elasticsearch)(1)

# RESOURCES

```[Source code](https://github.com/CradlePHP/cradle)```

```[Homepage](https://cradlephp.github.io)```

```[Documentation](https://cradlephp.github.io/docs/3.B.-Reference-Command-Line-Tools.html)```

<!-- verified: 2026-11-09 -->
