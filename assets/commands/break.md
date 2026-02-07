# TAGLINE

Exit from a loop in shell scripts

# TLDR

**Break** from loop

```break```

Break **multiple levels**

```break [2]```

# SYNOPSIS

**break** [_n_]

# DESCRIPTION

**break** is a bash built-in command that exits from a for, while, or until loop. It can optionally break out of multiple nested loops by specifying the number of levels.

The command is essential for loop control in shell scripts.

# PARAMETERS

_n_
> Number of loop levels to break (default: 1)

# WORKFLOW

```bash
# Break from single loop
for i in {1..10}; do
  if [ $i -eq 5 ]; then
    break
  fi
  echo $i
done

# Break from nested loops
for i in {1..3}; do
  for j in {1..3}; do
    if [ $j -eq 2 ]; then
      break 2  # Break both loops
    fi
    echo "$i $j"
  done
done

# Break from while loop
while read line; do
  if [ "$line" = "END" ]; then
    break
  fi
  process "$line"
done < file.txt
```

# CAVEATS

Only works within loops (for, while, until). Breaking more levels than exist exits all loops. Not the same as exit (which exits entire script). Continue skips to next iteration instead of exiting.

# HISTORY

**break** has been a standard shell built-in command since the Bourne shell in the late **1970s**.

# SEE ALSO

[continue](/man/continue)(1), [return](/man/return)(1), [exit](/man/exit)(1)
