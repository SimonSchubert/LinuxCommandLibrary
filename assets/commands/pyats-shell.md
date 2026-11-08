# TAGLINE

Interactive pyATS testing shell

# TLDR

**Start pyATS shell**

```pyats shell```

**Start with testbed**

```pyats shell --testbed-file [testbed.yaml]```

# SYNOPSIS

**pyats shell** [_options_]

# PARAMETERS

**--testbed-file** _file_
> Testbed YAML file to load into the **testbed** variable.

**--no-ipython**
> Do not start IPython, use the plain Python shell.

# DESCRIPTION

**pyats shell** starts an interactive Python shell with pyATS libraries loaded. With **--testbed-file**, the YAML file is loaded into a global variable named **testbed**, saving the manual loader calls. IPython is used when installed; exit with exit() or Ctrl-D. Part of Cisco pyATS framework.

# SEE ALSO

[pyats](/man/pyats)(1)

# RESOURCES

```[Source code](https://github.com/CiscoTestAutomation/pyats)```

```[Homepage](https://developer.cisco.com/pyats/)```

```[Documentation](https://pubhub.devnetcloud.com/media/pyats/docs/)```

<!-- verified: 2026-11-08 -->
