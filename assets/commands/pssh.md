# TAGLINE

Run commands on multiple hosts in parallel

# TLDR

**Run command on multiple hosts**

```pssh -h [hosts.txt] -i "[uptime]"```

**Run with inline hosts**

```pssh -H "[user@host1] [user@host2]" -i "[command]"```

**Run with parallel limit**

```pssh -h [hosts.txt] -p [10] -i "[command]"```

**Run with timeout**

```pssh -h [hosts.txt] -t [30] -i "[command]"```

**Copy file to hosts**

```pscp -h [hosts.txt] [local_file] [/remote/path]```

**Copy file from hosts**

```pslurp -h [hosts.txt] [/remote/file] [local_dir]```

**Run interactively**

```pssh -h [hosts.txt] -i -A "[sudo command]"```

# SYNOPSIS

**pssh** [_-h hostfile_] [_-H hosts_] [_-p parallel_] [_-t timeout_] [_-i_] [_options_] _command_

# PARAMETERS

**-h** _FILE_
> File with hosts (one per line).

**-H** _HOSTS_
> Space-separated hosts.

**-l** _USER_
> Default username.

**-p** _NUM_
> Max parallel connections.

**-t** _SECONDS_
> Timeout per host.

**-i**, **--inline**
> Display output inline.

**-o** _DIR_
> Output directory.

**-e** _DIR_
> Error output directory.

**-A**
> Prompt for password.

**-O** _OPTS_
> SSH options.

**-x** _ARGS_
> Extra SSH arguments.

**-v**
> Verbose mode.

# DESCRIPTION

**pssh** (Parallel SSH) runs commands on multiple hosts simultaneously. It parallelizes SSH connections for faster execution across large server fleets.

Host files list target machines, one per line. Format supports user@host:port syntax. Comments start with #.

Parallel limit controls concurrent connections. Too many simultaneous connections may overwhelm networks or hosts. Start conservatively.

Output modes collect results differently. Inline (-i) shows output as it arrives. Directory mode (-o) saves per-host output files.

Related tools include pscp for parallel file copy to hosts, pslurp for parallel file retrieval, and prsync for parallel rsync.

Timeout prevents hanging on unresponsive hosts. Failed hosts are reported separately from successful ones.

# CAVEATS

Requires SSH key auth for non-interactive use. Password prompt (-A) is interactive. Large parallel counts may cause issues. Hostnames must resolve.

# HISTORY

**pssh** was created by **Brent N. Chun** at Intel Research around **2007**. It addressed the need for efficient multi-host command execution in cluster and cloud environments.

# SEE ALSO

[ssh](/man/ssh)(1), [pdsh](/man/pdsh)(1), [ansible](/man/ansible)(1), [clusterssh](/man/clusterssh)(1)
