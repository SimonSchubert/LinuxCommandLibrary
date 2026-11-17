# TAGLINE

Copy-on-write MySQL and PostgreSQL branches on ZFS

# TLDR

**Initialize** a host against a ZFS pool

```sudo db-branch init --pool [pool]```

Install a database **runtime**

```db-branch runtime install postgres@18.6```

List runtimes that can be **installed**

```db-branch runtime available```

Load a **base** from a dump

```db-branch base create prod --runtime postgres@18.6 --dump [prod.sql.gz]```

Create a **branch** that expires

```db-branch branch create feature-x --base prod --ttl 72h```

Print a branch **connection URL**

```db-branch branch dsn feature-x```

**Checkpoint**, then restore or reset

```db-branch branch checkpoint feature-x --name before-migration```

```db-branch branch restore feature-x before-migration```

```db-branch branch reset feature-x```

**Delete** a branch

```db-branch branch delete feature-x```

See what an **upgrade** would do, then run it on one branch

```db-branch branch upgrade feature-x --runtime mysql@8.4.13 --check-only```

# SYNOPSIS

**db-branch** _COMMAND_ [_OPTIONS_]

# DESCRIPTION

**db-branch** creates copy-on-write branches of MySQL and PostgreSQL databases on a ZFS pool. A base is a dataset with the data loaded once. A branch is a clone of a snapshot of that base, so creating one copies no payload, and each branch runs its own server on its own port.

The same API is exposed as this CLI, a REST service, a web console, and an MCP server. The command is **db-branch**. On the host it is typically run with sudo, as in **sudo db-branch init**.

The project targets Ubuntu 24.04 LTS and 26.04 LTS with ZFS (**zfsutils-linux** is a dependency). Status is beta: command details may change before 1.0.

Vendor packages come from **https://apt.db-branch.com** (package **db-branch**). The published signing-key fingerprint is **3F404C4E5D49FA653F8385692C6E89E341D4D7A5**. **init** prints the first admin password once.

Core (branches, bases, runtimes, clustering, CLI, API, console, MCP) is Apache-2.0. Some modules are separate packages, and some of those are paid.

MySQL is the same flow, for example **mysql@8.4.13**. **--record** on **branch create** keeps a history so the branch can be restored to a point in time. **--ttl** deletes the branch when the time is up.

# CAVEATS

A branch DSN includes a password. **branch reset** and **branch restore** discard the current state of that branch. **branch upgrade** moves one branch to another engine version. It saves a checkpoint first and rolls back a failed upgrade. The base and other branches stay on their current version.

There is no hosted edition. A file-backed pool used for a local trial is not meant for real data.

# SEE ALSO

[zfs](/man/zfs)(8), [zpool](/man/zpool)(8), [psql](/man/psql)(1), [mysql](/man/mysql)(1)

# RESOURCES

```[Source code](https://github.com/db-branch/db-branch)```

```[Homepage](https://db-branch.com)```

```[Documentation](https://db-branch.com/docs/)```

<!-- verified: 2026-11-17 -->
