# TLDR

**Save snapshot**

```vagrant snapshot save [name]```

**Restore snapshot**

```vagrant snapshot restore [name]```

**List snapshots**

```vagrant snapshot list```

**Delete snapshot**

```vagrant snapshot delete [name]```

**Quick save**

```vagrant snapshot push```

# SYNOPSIS

**vagrant** **snapshot** _command_ [_options_]

# PARAMETERS

**save** _name_
> Create named snapshot.

**restore** _name_
> Restore to snapshot.

**list**
> List snapshots.

**delete** _name_
> Remove snapshot.

**push**
> Quick save (unnamed).

**pop**
> Restore and delete last push.

# DESCRIPTION

**vagrant snapshot** manages VM snapshots. Save and restore VM states for testing and development. Supports named snapshots and quick push/pop operations.

# SEE ALSO

[vagrant](/man/vagrant)(1)

