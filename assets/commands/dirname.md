# TLDR

**Get** directory path

```dirname [/path/to/file.txt]```

**Multiple** paths

```dirname -z [file1] [file2]```

# SYNOPSIS

**dirname** _path_...

# DESCRIPTION

**dirname** extracts the directory portion of a pathname, removing the last component. It's commonly used in shell scripts to find the directory containing a file or script.

The command is the complement to basename.

# PARAMETERS

**-z**, **--zero**
> Separate output with NUL instead of newline

# BEHAVIOR

Given `/path/to/file.txt`:
- **dirname** returns `/path/to`

Given `/path/to/`:
- **dirname** returns `/path`

Given `file.txt`:
- **dirname** returns `.`

Given `/`:
- **dirname** returns `/`

# WORKFLOW

```bash
# Get directory
dirname /usr/local/bin/command
# Output: /usr/local/bin

# Get parent of current script
SCRIPT_DIR=$(dirname "$0")

# Get absolute path to script directory
SCRIPT_DIR=$(cd "$(dirname "$0")" && pwd)

# Multiple files
dirname /path/to/file1 /path/to/file2

# In scripts
cd "$(dirname "$0")"  # Change to script's directory
```

# COMMON USES

**Script directory:**
```bash
#!/bin/bash
SCRIPT_DIR=$(dirname "$0")
source "$SCRIPT_DIR/config.sh"
```

**Parent directory:**
```bash
parent=$(dirname "/path/to/file")
```

**Multiple levels:**
```bash
# Go up two directories
grandparent=$(dirname "$(dirname "/path/to/file")")
```

# CAVEATS

Doesn't resolve symbolic links (use readlink). Doesn't check if path exists. Trailing slashes affect output. Doesn't handle all edge cases (empty strings, etc.). Path doesn't need to exist.

# HISTORY

**dirname** has been part of Unix since the early days, included in POSIX standards alongside basename.

# SEE ALSO

[basename](/man/basename)(1), [realpath](/man/realpath)(1), [readlink](/man/readlink)(1)
