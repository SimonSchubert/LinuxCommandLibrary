# TAGLINE

automated login to Cisco network devices

# TLDR

**Login to a Cisco device**

```clogin [hostname]```

**Login with specific username**

```clogin -u [username] [hostname]```

**Login and run commands from file**

```clogin -x [commands.txt] [hostname]```

**Login with autoenable**

```clogin -autoenable [hostname]```

**Login to multiple devices**

```clogin [host1] [host2] [host3]```

**Login with specific password file**

```clogin -f [/path/to/.cloginrc] [hostname]```

# SYNOPSIS

**clogin** [_options_] _hostname_ [_hostname_...]

# PARAMETERS

**-u** _username_
> Specify username for login.

**-p** _password_
> Specify password (insecure, use .cloginrc instead).

**-e** _enable_password_
> Specify enable password.

**-autoenable**
> Automatically enter enable mode.

**-c** _command_
> Execute command after login.

**-x** _cmdfile_
> Execute commands from file.

**-f** _rcfile_
> Use alternate configuration file.

**-t** _timeout_
> Set login timeout in seconds.

**-d**
> Enable debug output.

**-v**
> Enable verbose output.

# DESCRIPTION

**clogin** is part of RANCID (Really Awesome New Cisco confIg Differ), a network device configuration management system. It provides automated login to Cisco and compatible network devices, handling authentication and enable mode transitions.

The tool uses Expect scripts to automate the interactive login process, supporting various authentication methods and device prompts. It can execute commands or scripts across multiple devices, making it valuable for network automation and configuration backup.

Credentials are typically stored in **.cloginrc** with restricted permissions. The tool supports SSH, telnet, and other access methods depending on device configuration.

# CONFIGURATION

**~/.cloginrc**
> Stores device credentials, authentication methods, and connection settings. Must be chmod 600.

# CAVEATS

Requires Expect and Tcl. The .cloginrc file contains sensitive credentials; protect with **chmod 600**. Some device prompts may not be recognized without customization. Modern alternatives like Ansible or Netmiko may be preferred for new automation projects.

# HISTORY

clogin was developed as part of **RANCID** (Really Awesome New Cisco confIg Differ) by **Henry Kilmer** and others at **Shrubbery Networks** in the late **1990s**. RANCID was created to automate configuration backup and change tracking for network devices. The toolkit has grown to support numerous vendors beyond Cisco, with clogin handling Cisco-specific devices.

# SEE ALSO

[rancid](/man/rancid)(1), [jlogin](/man/jlogin)(1), [expect](/man/expect)(1)
