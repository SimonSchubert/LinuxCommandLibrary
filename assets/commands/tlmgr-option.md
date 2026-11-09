# TAGLINE

Configure TeX Live installation options

# TLDR

**Show options that are set**

```tlmgr option```

**Show specific option**

```tlmgr option [optionname]```

**Set option value**

```tlmgr option [optionname] [value]```

**Show all options, including unset ones**

```tlmgr option showall```

**Get future updates from a nearby CTAN mirror**

```tlmgr option repository ctan```

**Keep every backup (-- stops -1 being read as a flag)**

```tlmgr option -- autobackup -1```

# SYNOPSIS

**tlmgr option** [**--json**] [show]

**tlmgr option** [**--json**] showall|help

**tlmgr option** _key_ [_value_]

# PARAMETERS

**repository**
> Default package repository (**location** is a synonym).

**autobackup**
> Number of backups to keep: 0 disables backups, -1 never removes them. Default 1.

**backupdir**
> Default directory for backups.

**docfiles**
> Install documentation (0/1). Default 1.

**srcfiles**
> Install source files (0/1). Default 1.

**formats**
> Regenerate formats at installation or update time. On by default.

**postcode**
> Run per-package post-install code. On by default.

**sys_bin**
> Directory where **tlmgr path** links executables.

**sys_man**
> Directory where **tlmgr path** links man pages.

**sys_info**
> Directory where **tlmgr path** links Info files.

**desktop_integration**, **fileassocs**, **multiuser**
> Windows only: Start menu shortcuts, file associations, install for all users.

**--json**
> Dump option information in JSON format.

# DESCRIPTION

**tlmgr option** manages TeX Live installation options. Configure repository, backup settings, and what to install. Part of TeX Live Manager. Settings are saved in the TeX Live package database. Run **tlmgr option showall** for the definitive list of keys.

# SEE ALSO

[tlmgr-conf](/man/tlmgr-conf)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
