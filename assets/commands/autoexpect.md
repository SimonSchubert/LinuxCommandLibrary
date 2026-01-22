# TLDR

Spawn a shell and **generate a script** from the session

```autoexpect```

Run a command and **generate a script** from it

```autoexpect [command]```

Generate a script and **save to a specific file**

```autoexpect -f [path/to/file] [command]```

# SYNOPSIS

**autoexpect** [_options_] [_command_...]

# DESCRIPTION

**autoexpect** watches an interactive session and generates an Expect script that can replay the session automatically. It records user input and program responses, creating a script suitable for automating repetitive interactive tasks.

The generated script is saved as **script.exp** by default. This script can be modified and reused to automate the recorded interaction.

# PARAMETERS

**-f** _file_
> Save the generated script to the specified file instead of script.exp

**-p**
> Use programmer mode (generate more verbose output)

**-t**
> Set conservative timing

# CAVEATS

Generated scripts may need manual editing for robustness. Passwords and sensitive data entered during recording are captured in the script. The timing of interactions may need adjustment for reliable playback.

# HISTORY

**autoexpect** is part of the Expect package, created by Don Libes at NIST. Expect was first released in **1990** and has been widely used for automating interactive applications.

# SEE ALSO

[expect](/man/expect)(1), [ssh](/man/ssh)(1)
