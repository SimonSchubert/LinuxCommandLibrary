# TAGLINE

display information about known users and groups on the system

# TLDR

**Show all users** (default view)

```lslogins```

**Show only user accounts** (non-system)

```lslogins --user-accs```

**Show only system accounts**

```lslogins --system-accs```

**Show details for a specific user**

```lslogins [username]```

**List members of specific groups**

```lslogins --groups [group1,group2]```

**Show last-login information**

```lslogins --last```

**Show failed login attempts**

```lslogins --failed```

**Show supplementary group memberships**

```lslogins --supp-groups```

**Pick specific columns**

```lslogins -o [USER,UID,GID,HOMEDIR,SHELL]```

# SYNOPSIS

**lslogins** [_options_] [_username_...]

# DESCRIPTION

**lslogins** displays information about known users and groups on a Linux system, combining data from `/etc/passwd`, `/etc/shadow`, `/etc/group`, `lastlog`, `faillog`, and wtmp. It is a more comprehensive replacement for piecing together output from `who`, `last`, `id`, and `getent`.

By default it prints a table with one row per user. Output columns and format can be tuned with `-o`, `--raw`, `--json`, `--colon-separate`, and `--export` for scripting.

# PARAMETERS

**-a**, **--acc-expiration**
> Show last password change and account/password expiration dates.

**-c**, **--colon-separate**
> Separate user records with a colon instead of a newline.

**-e**, **--export**
> Output in `NAME="value"` shell-sourceable form.

**-f**, **--failed**
> Include data about each user's last failed login.

**-G**, **--supp-groups**
> Show supplementary groups.

**-g**, **--groups** _GROUPS_
> Only show users that belong to one of the listed groups (comma-separated).

**-L**, **--last**
> Show last-login information from `lastlog`.

**-l**, **--logins** _LOGINS_
> Only show users whose login name or UID is in the comma-separated list.

**-n**, **--newline**
> Print each field on its own line.

**--noheadings**
> Suppress column headers.

**--notruncate**
> Do not truncate long output columns.

**-o**, **--output** _LIST_
> Comma-separated list of columns to display. Use `--help` for the full column list.

**--output-all**
> Print all available columns.

**-p**, **--pwd**
> Show password status information.

**-r**, **--raw**
> Raw, unformatted output.

**-s**, **--system-accs**
> Show only system accounts (UID below the configured threshold).

**-u**, **--user-accs**
> Show only non-system user accounts.

**-J**, **--json**
> Output in JSON.

**-Z**, **--context**
> Show SELinux user context.

**--time-format** _TYPE_
> `short`, `full`, or `iso` formatting for date columns.

**-V**, **--version**
> Print version information.

**-h**, **--help**
> Show help and the list of supported columns.

# CAVEATS

Some columns (last login, failed login, password expiration) require the calling user to have read access to `/var/log/lastlog`, `/var/log/faillog`, or `/etc/shadow` — typically root. Distributions that do not ship `lastlog`/`faillog` will show empty values for those columns.

# HISTORY

**lslogins** was added to **util-linux** (upstream by **Ondrej Oprala**) to consolidate information previously spread across `who`, `last`, `lastlog`, `faillog`, and `getent passwd`.

# SEE ALSO

[who](/man/who)(1), [last](/man/last)(1), [id](/man/id)(1), [getent](/man/getent)(1), [passwd](/man/passwd)(1)
