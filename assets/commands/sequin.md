# TAGLINE

Stream database changes via change data capture

# TLDR

**Start consumer**

```sequin start```

**List streams**

```sequin streams```

**Create consumer**

```sequin consumers create [name]```

**Check status**

```sequin status```

**View logs**

```sequin logs```

# SYNOPSIS

**sequin** _command_ [_options_]

# PARAMETERS

**start**
> Start consumer.

**streams**
> List streams.

**consumers**
> Manage consumers.

**status**
> Show status.

**logs**
> View logs.

**--config** _FILE_
> Config file.

# DESCRIPTION

**sequin** is a change data capture (CDC) tool that streams real-time database changes from PostgreSQL. It captures inserts, updates, and deletes as they happen and delivers them to consumers via HTTP webhooks or message queues.

Consumers subscribe to specific streams of changes and process them in order. The tool manages consumer state, tracking which changes have been delivered and acknowledged. This enables building event-driven architectures and keeping downstream systems synchronized with database state.

# CAVEATS

Postgres focused. Service connection needed. Configuration required.

# HISTORY

**Sequin** is a change data capture tool for streaming database changes in real-time.

# SEE ALSO

[debezium](/man/debezium)(1), [psql](/man/psql)(1), [kafka](/man/kafka)(1)
