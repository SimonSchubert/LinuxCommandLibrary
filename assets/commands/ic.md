# TAGLINE

shortcut for the ibmcloud command

# TLDR

**Run** any ibmcloud command through the shortcut

```ic [command]```

**Log in** to IBM Cloud

```ic login```

**Show** the current target account and region

```ic target```

**List** the installed plugins

```ic plugin list```

**Define** the shortcut by hand in the current shell

```alias ic="ibmcloud"```

**Make** the shortcut permanent

```echo 'alias ic="ibmcloud"' >> ~/.bashrc```

# SYNOPSIS

**ic** _command_ [_arguments_] [_options_]

# DESCRIPTION

**ic** is a shortcut for **ibmcloud**, the IBM Cloud command line interface. Every argument is passed through unchanged, so `ic login`, `ic target`, and `ic ks cluster ls` behave exactly like the corresponding `ibmcloud` commands.

The shortcut is not part of the stand-alone IBM Cloud CLI package, which installs only the `ibmcloud` binary plus the legacy `bluemix` and `bx` symlinks. It is created by the IBM Cloud Developer Tools installer, which appends `alias ic="ibmcloud"` to the first shell startup file it finds among `~/.bashrc`, `~/.bash_profile`, `~/.profile`, and `~/.zshrc`. On Windows the same installer writes a wrapper script at `C:\Program Files\IBM\Cloud\bin\ic.bat`.

Because it is only an alias, nothing else has to be maintained: it follows whatever `ibmcloud` version is on `PATH`, and it can be recreated at any time with a single `alias` line.

# CAVEATS

On Linux and macOS **ic** is a shell alias, not an executable. It is unavailable in non-interactive shells, in scripts run with `sh -c`, and to anything that execs a program by name, such as `xargs`, `find -exec`, `sudo`, or a systemd unit. Use `ibmcloud` in those places.

The alias is expanded before the program starts, so the CLI reports its own name in help text and error messages, for example `'not-found' is not a registered command. See 'ibmcloud help'.`

A shell that was already running when the installer added the alias does not see it until the startup file is re-sourced or the shell is restarted.

`ic` is also a plain English abbreviation, so a locally defined function or alias with the same name will shadow this one. Run `type ic` to see what it currently resolves to.

# HISTORY

The **ic** shortcut was introduced by **IBM Cloud Developer Tools** as a convenience wrapper around the IBM Cloud CLI, which itself replaced the earlier `bluemix` (`bx`) CLI when Bluemix was rebranded to IBM Cloud around **2018**. An open request asks for the alias to be replaced by a symlink so that `ic` shows up in the CLI's own messages.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1), [ibmcloud-target](/man/ibmcloud-target)(1), [alias](/man/alias)(1)

# RESOURCES

```[Source code](https://github.com/IBM-Cloud/ibm-cloud-developer-tools)```

```[Homepage](https://cloud.ibm.com/docs/cli)```

```[Documentation](https://cloud.ibm.com/docs/cli?topic=cli-ibmcloud_cli)```

<!-- verified: 2026-08-30 -->
