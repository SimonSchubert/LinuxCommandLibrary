# TLDR

**Dump local database**

```tlmgr dump-tlpdb --local```

**Dump remote database**

```tlmgr dump-tlpdb --remote```

**Output in JSON**

```tlmgr dump-tlpdb --local --json```

# SYNOPSIS

**tlmgr dump-tlpdb** [_options_]

# PARAMETERS

**--local**
> Dump local installation database.

**--remote**
> Dump remote repository database.

**--json**
> Output in JSON format.

# DESCRIPTION

**tlmgr dump-tlpdb** outputs the TeX Live package database. Useful for scripting, debugging, and comparing installations. Part of TeX Live Manager.

# SEE ALSO

[tlmgr-info](/man/tlmgr-info)(1), [tlmgr](/man/tlmgr)(1)

