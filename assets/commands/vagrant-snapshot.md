# TAGLINE

Save and restore Vagrant VM states

# TLDR

**Save snapshot**

```vagrant snapshot save [name]```

**Save snapshot of a specific VM**

```vagrant snapshot save [vm-name] [name]```

**Restore snapshot**

```vagrant snapshot restore [name]```

**List snapshots**

```vagrant snapshot list```

**Delete snapshot**

```vagrant snapshot delete [name]```

**Quick save**

```vagrant snapshot push```

**Restore last push but keep the snapshot**

```vagrant snapshot pop --no-delete```

# SYNOPSIS

**vagrant** **snapshot** _command_ [_options_] [_vm-name_] [_name_]

# PARAMETERS

**save** [_vm-name_] _name_
> Create named snapshot. **-f**, **--force** replaces an existing snapshot without confirmation.

**restore** [_vm-name_] _name_
> Restore to snapshot. Accepts **--[no-]provision** and **--no-start**.

**list** [_vm-name_]
> List snapshots.

**delete** [_vm-name_] _name_
> Remove snapshot.

**push** [_vm-name_]
> Quick save (unnamed), pushed onto the snapshot stack.

**pop** [_vm-name_]
> Restore and delete last push. Accepts **--[no-]provision**, **--no-delete** and **--no-start**.

# DESCRIPTION

**vagrant snapshot** manages VM snapshots. Save and restore VM states for testing and development. Supports named snapshots and quick push/pop operations.

# CAVEATS

Not every provider supports snapshots; Vagrant reports an error if yours does not. Do not mix **push**/**pop** with **save**/**restore**, as this is unsafe. Some providers (such as VirtualBox) require child snapshots to be deleted first, so delete in reverse order of creation.

# SEE ALSO

[vagrant](/man/vagrant)(1)

# RESOURCES

```[Source code](https://github.com/hashicorp/vagrant)```

```[Documentation](https://developer.hashicorp.com/vagrant/docs/cli/snapshot)```

<!-- verified: 2026-11-09 -->
