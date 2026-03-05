# TAGLINE

Manage /etc/hosts with profiles

# TLDR

**List all profiles** and their entries

```hostctl list```

**Add entries to a profile**

```hostctl add [profile_name] [ip] [hostname]```

**Enable a profile**

```hostctl enable [profile_name]```

**Disable a profile**

```hostctl disable [profile_name]```

**Remove a profile**

```hostctl remove [profile_name]```

**Import a profile from a file**

```hostctl set [profile_name] -from [path/to/file]```

**Create a backup** of the hosts file

```hostctl backup```

**Sync profile with Docker Compose** containers

```hostctl sync dockercompose -f [docker-compose.yml] -p [profile_name]```

# SYNOPSIS

**hostctl** _command_ [_options_] [_arguments_]

# DESCRIPTION

**hostctl** is a CLI tool for managing your **/etc/hosts** file using profiles. You can have multiple profiles, enable or disable exactly what you need, and switch between different host configurations with simple commands. It automatically detects your OS and uses the correct hosts file location.

Profiles allow grouping host entries for different environments (development, staging, production) and toggling them on or off without manual file editing. It also supports syncing profiles with **Docker** and **Docker Compose** containers.

# PARAMETERS

**list**
> Show a detailed list of profiles and entries

**add** _profile_ _ip_ _hostname_
> Add an entry to a profile

**enable** _profile_
> Enable a profile

**disable** _profile_
> Disable a profile

**remove** _profile_
> Remove a profile entirely

**set** _profile_
> Replace content of a profile

**backup**
> Create a backup of the hosts file

**sync**
> Sync with Docker or Docker Compose

# CAVEATS

Modifying the hosts file requires **root/administrator** privileges. Incorrect entries can break local DNS resolution. Always use the **backup** command before making large changes.

# HISTORY

**hostctl** was created by **guumaster** and is written in **Go**. It was designed to replace manual editing of the hosts file with a structured, profile-based approach that integrates with modern development workflows.

# SEE ALSO

[hosts](/man/hosts)(5)
