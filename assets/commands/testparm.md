# TAGLINE

Check a Samba smb.conf configuration file for correctness

# TLDR

**Check the default smb.conf** for errors

```testparm```

**Check a specific configuration file**

```testparm [path/to/smb.conf]```

**Check and suppress the prompt** for pressing Enter between sections

```testparm -s```

**Show all parameters** including defaults that are not explicitly set

```testparm -v```

**Query a specific parameter** value

```testparm --parameter-name "[server role]"```

**Query a parameter** from a specific share section

```testparm --parameter-name "[path]" --section-name "[myshare]"```

**Check if a specific host** has access to services

```testparm [path/to/smb.conf] [hostname] [host_ip]```

# SYNOPSIS

**testparm** [_-s_] [_-v_] [_-l_] [_-d LEVEL_] [_--parameter-name NAME_] [_--section-name NAME_] [_config filename_] [_hostname hostIP_]

# PARAMETERS

**-s**, **--suppress-prompt**
> Do not prompt for a carriage return after displaying service names.

**-v**, **--verbose**
> Show all options, including defaults not explicitly set in the configuration.

**-l**, **--skip-logic-checks**
> Skip global validation logic checks.

**--parameter-name** _NAME_
> Print the value of a specific parameter. Use a colon to specify section context.

**--section-name** _NAME_
> Restrict **--parameter-name** output to a specific configuration section.

**--show-all-parameters**
> Show all parameters with their types and possible values.

**-d**, **--debuglevel** _LEVEL_
> Set debug verbosity level (0-10, default 1).

**--debug-stdout**
> Send debug output to stdout instead of stderr.

**--configfile** _FILE_
> Specify the configuration file location.

**--option** _NAME=VALUE_
> Set a specific smb.conf option on the command line.

**-V**, **--version**
> Print version information.

**-?**, **--help**
> Display help.

# DESCRIPTION

**testparm** is a Samba utility that validates **smb.conf** configuration files for internal correctness. It parses the configuration, checks for syntax errors and invalid parameter values, and reports any problems found. If the file loads successfully, it displays all known service definitions.

When a hostname and IP address are provided as arguments, testparm also checks whether the specified host would be granted or denied access to each configured service, based on the **hosts allow** and **hosts deny** directives.

The tool returns exit code **0** on success and **1** on error, making it suitable for use in scripts and automated deployment pipelines.

# CONFIGURATION

The default configuration file is **/etc/samba/smb.conf**. Pass an alternative path as the first positional argument to check a different file. Use **--option** to override individual settings during validation.

# CAVEATS

testparm checks for **syntactic correctness** but cannot guarantee that services will work as intended. A file that passes validation may still have logical errors (e.g. pointing to non-existent paths or conflicting share permissions). Weak cryptographic algorithm warnings (DES, ARCFOUR, SHA1, MD5) are informational and relate to Samba's cryptographic fallback behavior.

# HISTORY

**testparm** has been part of the **Samba** suite since its early releases. Samba was originally written by **Andrew Tridgell** in **1992** to provide SMB/CIFS file and print services on Unix. The testparm utility was created to help administrators validate configuration changes before restarting the Samba daemons, reducing downtime from misconfiguration.

# SEE ALSO

[smbclient](/man/smbclient)(1), [samba](/man/samba)(7)
