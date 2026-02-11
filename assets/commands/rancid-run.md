# TAGLINE

Collect and version-control network device configurations

# TLDR

**Run RANCID for all groups**

```rancid-run```

**Run for specific group**

```rancid-run [group_name]```

**Run with email notification**

```rancid-run -m [email@example.com]```

# SYNOPSIS

**rancid-run** [_options_] [_group_...]

# PARAMETERS

**-m** _email_
> Send results to email.

**-r** _device_
> Process single device.

**-f**
> Force run.

# DESCRIPTION

**rancid-run** executes RANCID (Really Awesome New Cisco confIg Differ) to collect and version-control network device configurations. It connects to routers, switches, and firewalls to backup their configs.

# EXAMPLES

```bash
# Run all groups
rancid-run

# Specific group
rancid-run routers

# Multiple groups
rancid-run routers switches firewalls

# With email
rancid-run -m admin@example.com routers
```

# SETUP

```bash
# 1. Create group
/var/lib/rancid/bin/rancid-cvs groupname

# 2. Add devices to router.db
# /var/lib/rancid/groupname/router.db
router1.example.com:cisco:up

# 3. Configure credentials
# ~/.cloginrc
add user router1.example.com admin
add password router1.example.com {password}

# 4. Run
rancid-run groupname
```

# CONFIGURATION

**/etc/rancid/rancid.conf**
> Main configuration defining device groups, version control system, and working directory paths.

**~/.cloginrc**
> Device login credentials file specifying usernames, passwords, and enable passwords for each network device.

**router.db**
> Per-group device inventory listing hostnames, device types (cisco, juniper, etc.), and up/down status.

# CAVEATS

Requires CVS or Git for version control. Device credentials in .cloginrc. Usually run via cron.

# HISTORY

RANCID was developed by **Shrubbery Networks** for automating network device configuration backup and change tracking.

# SEE ALSO

[clogin](/man/clogin)(1), [rancid-cvs](/man/rancid-cvs)(1), [oxidized](/man/oxidized)(1)
