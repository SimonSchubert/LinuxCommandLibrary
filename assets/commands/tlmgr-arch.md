# TAGLINE

Manage TeX Live platform architectures

# TLDR

**List supported architectures**

```tlmgr arch```

**List only installed**

```tlmgr arch --installed```

**Add architecture**

```tlmgr arch add [x86_64-linux]```

**Remove architecture**

```tlmgr arch remove [i386-linux]```

# SYNOPSIS

**tlmgr arch** [_action_] [_arch_...]

# PARAMETERS

**--installed**
> Show only installed architectures.

**add** _arch_
> Add platform binaries.

**remove** _arch_
> Remove platform binaries.

**list**
> List available architectures.

# DESCRIPTION

**tlmgr arch** manages TeX Live platform support. Install binaries for additional architectures for cross-platform TeX distribution. Part of TeX Live Manager.

# SEE ALSO

[tlmgr-platform](/man/tlmgr-platform)(1), [tlmgr](/man/tlmgr)(1)

