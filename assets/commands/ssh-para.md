# TAGLINE

Parallel SSH jobs manager with interactive CLI

# TLDR

**Run a command on multiple hosts**

```ssh-para -H [host1] [host2] [host3] -- echo connection ok```

**Mass patch with 20 parallel jobs**

```ssh-para -p 20 -f [hostlist.txt] -- 'sudo yum update -y'```

**Execute a local script on remote hosts**

```ssh-para -p 20 -f [hosts.txt] -s [./myscript] -a status```

# SYNOPSIS

**ssh-para** [**-p** _parallelism_] [**-H** _hosts_... | **-f** _hostfile_] **--** _command_

# PARAMETERS

**-p** _N_
> Number of parallel SSH connections.

**-H** _HOSTS_
> Space-separated list of target hosts.

**-f** _FILE_
> File containing target hostnames, one per line.

**-s** _SCRIPT_
> Local script to execute on remote hosts.

**-a** _ARGS_
> Arguments to pass to the script.

# DESCRIPTION

**ssh-para** enables executing commands and scripts across multiple remote servers simultaneously with interactive real-time output monitoring. It supports pausing, resuming, and aborting jobs, killing stuck connections, configurable parallelism, and log generation. Requires SSH key-based authentication.

# HISTORY

**ssh-para** was created by **joknarf** and is written in **Python**.

# SEE ALSO

[pssh](/man/pssh)(1), [pdsh](/man/pdsh)(1), [sake](/man/sake)(1)
