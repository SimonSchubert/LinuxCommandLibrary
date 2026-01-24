# TLDR

**Initialize the database** (create baseline)

```sudo tripwire --init```

**Run an integrity check**

```sudo tripwire --check```

**Run integrity check** in interactive mode

```sudo tripwire --check --interactive```

**Update the database** after legitimate changes

```sudo tripwire --update --twrfile [path/to/report.twr]```

**Update the policy file**

```sudo tripwire --update-policy [path/to/policy.txt]```

**Test the configuration** without modifying

```sudo tripwire --test```

# SYNOPSIS

**tripwire** {**--init** | **--check** | **--update** | **--update-policy** | **--test**} [_options_]

# PARAMETERS

**-m i**, **--init**
> Database initialization mode. Create baseline database from current filesystem state.

**-m c**, **--check**
> Integrity checking mode. Compare current filesystem against baseline database.

**-m u**, **--update**
> Database update mode. Update database to reflect legitimate changes.

**-m p**, **--update-policy**
> Policy update mode. Apply new policy and synchronize database.

**-m t**, **--test**
> Test mode. Verify configuration without making changes.

**-I**, **--interactive**
> Open report in editor after integrity check for easy database update selection.

**-r** _file_, **--twrfile** _file_
> Specify report file for database update mode.

**-p** _file_, **--polfile** _file_
> Specify policy file to use.

**-c** _file_, **--cfgfile** _file_
> Specify configuration file location.

**-v**, **--verbose**
> Enable verbose output.

**-s**, **--silent**
> Suppress output except errors.

**-n**, **--no-tty-output**
> Suppress report from being printed to console.

**-E**, **--signed-report**
> Create cryptographically signed report.

# DESCRIPTION

**Tripwire** is a host-based intrusion detection system (HIDS) that monitors filesystem integrity. It creates a baseline database of file attributes and periodically compares the current state against this baseline to detect unauthorized additions, deletions, or modifications.

The tool operates in several modes: initialization creates the baseline database, integrity checking compares current files against the baseline, database update incorporates legitimate changes, and policy update modifies monitoring rules. All database and policy files are cryptographically signed to prevent tampering.

Tripwire uses two encryption keys: a site key for organization-wide policies and a local key unique to each server. This allows centralized policy management while maintaining per-server database security.

Exit codes from integrity checking indicate what changed: 0 (no changes), 1 (files added), 2 (files modified), 4 (files deleted), 8 (errors).

# CAVEATS

The baseline database must be created after a known-clean system state. Running with verbose output can expose sensitive file paths. Reports should be reviewed promptly as attackers could modify files and then restore them between checks. The database file should be stored securely, preferably on read-only media.

# HISTORY

**Tripwire** was originally developed by **Gene Kim** and **Gene Spafford** at **Purdue University** in **1992** as an academic research project. It became one of the first file integrity monitoring tools widely adopted for Unix security. The open-source version was later maintained by Tripwire Inc., with a commercial enterprise version also available. It remains a foundational tool in host-based intrusion detection.

# SEE ALSO

[aide](/man/aide)(1), [samhain](/man/samhain)(8), [md5sum](/man/md5sum)(1), [sha256sum](/man/sha256sum)(1)
