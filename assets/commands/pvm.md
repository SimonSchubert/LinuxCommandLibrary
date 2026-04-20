# TAGLINE

Parallel Virtual Machine console

# TLDR

**Start the PVM console**, launching the daemon if needed

```pvm```

**Start the console and add hosts** from a host file

```pvm [path/to/hostfile]```

**Show the current virtual machine** configuration

```pvm> conf```

**Add a host** to the virtual machine interactively

```pvm> add [hostname]```

**Remove a host** from the virtual machine

```pvm> delete [hostname]```

**Spawn a task** on the virtual machine

```pvm> spawn -[count] [a.out]```

**List all running PVM tasks**

```pvm> ps -a```

**Shut down all PVM daemons**

```pvm> halt```

# SYNOPSIS

**pvm** [_hostfile_]

# DESCRIPTION

**pvm** is the interactive console for the **Parallel Virtual Machine (PVM)** system. It is itself a PVM task that lets the user start, query, and modify a distributed virtual machine made from a heterogeneous collection of Unix (and Windows) hosts connected by a network.

Starting **pvm** contacts an already-running **pvmd3** daemon on the local host, or launches one if none is running. Passing a _hostfile_ additionally adds the listed machines to the virtual machine at startup. Once connected, the console displays a **pvm>** prompt and accepts interactive commands to manage hosts, tasks, and PVM environment.

PVM provides a single logical parallel computer from networked workstations, making it possible to run message-passing parallel programs across them. The console itself does not run parallel code; it is the administration front end.

# CONSOLE COMMANDS

**add** _hostname(s)_
> Add one or more hosts to the virtual machine.

**alias**
> Define or list command aliases.

**conf**
> List the current virtual machine configuration (hosts, archs, IDs).

**delete** _hostname(s)_
> Remove hosts from the virtual machine.

**echo** _args_
> Echo arguments to the console.

**export** _VAR_
> Add environment variables to the spawn export list.

**halt**
> Stop all **pvmd** daemons and exit PVM.

**help** [_command_]
> Print help for a console command.

**id**
> Print the console task ID.

**jobs**
> List running jobs.

**kill** _task-tid_
> Terminate a task by its PVM task ID.

**mstat** _host_
> Show status of hosts.

**pstat** _task-tid_
> Show status of a specific task.

**ps -a**
> List all PVM tasks.

**quit**
> Exit the console (leave the virtual machine running).

**reset**
> Kill all PVM tasks.

**setenv**
> Display or set environment variables.

**sig** _signum_ _task_
> Send a signal to a task.

**spawn** [_options_] _a.out_
> Spawn a task. Options: **-**_count_ (number of copies), **-**_host_ (target host), **-**_ARCH_ (architecture).

**unalias** _name_
> Remove an alias.

**version**
> Print the PVM version.

# HOST FILE

A host file is a newline-separated list of machine names, optionally with per-host options (login name, working directory, architecture). Example:

```
# one host per line; options use key=value
node1
node2 lo=alice
node3 ep=/opt/pvm3/bin/LINUX
```

# ENVIRONMENT

**PVM_ROOT**
> Root of the PVM installation (e.g. _/usr/lib/pvm3_).

**PVM_ARCH**
> Architecture name used to locate executables (e.g. _LINUX64_, _SUN4SOL2_).

**PVM_TMP**
> Directory for PVM scratch files (defaults to _/tmp_).

# FILES

**$HOME/.pvmrc**
> Commands executed on console startup.

**/tmp/pvmd.\<uid\>**
> Socket used to contact the local **pvmd** daemon.

**/tmp/pvml.\<uid\>**
> Per-user PVM log file.

# CAVEATS

PVM is **legacy** software: active development stopped in the mid-2000s and it has been effectively superseded by **MPI** implementations (**Open MPI**, **MPICH**) for serious parallel computing. It is still useful for educational contexts and maintenance of older scientific codebases. Default PVM network communication is unauthenticated and unencrypted, so it must only be used inside trusted networks.

# HISTORY

**PVM** was developed starting in **1989** at **Oak Ridge National Laboratory**, the **University of Tennessee**, and **Emory University** by **Al Geist**, **Adam Beguelin**, **Jack Dongarra**, **Robert Manchek**, **Weicheng Jiang**, and **Vaidy Sunderam**. It became the de-facto standard for heterogeneous distributed computing through the 1990s before the MPI standard took over. PVM version 3 is the most widely packaged release.

# SEE ALSO

[pvmd3](/man/pvmd3)(1), [pvm_intro](/man/pvm_intro)(1), [xpvm](/man/xpvm)(1), [mpirun](/man/mpirun)(1)
