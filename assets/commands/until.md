# TAGLINE

Shell loop executing until condition becomes true

# TLDR

**Loop until condition**

```until [condition]; do [commands]; done```

**Wait for file**

```until [ -f [file] ]; do sleep 1; done```

**Wait for process**

```until pgrep [process]; do sleep 1; done```

**Counter loop**

```until [ $i -gt 10 ]; do echo $i; i=$((i+1)); done```

# SYNOPSIS

**until** _condition_; **do** _commands_; **done**

# DESCRIPTION

**until** is a shell loop construct that repeatedly executes a block of commands as long as a condition evaluates to false. It is the logical opposite of **while**, which loops while a condition is true. The loop body executes at least once if the condition starts as false, and stops as soon as the condition becomes true.

The most common use of until is polling for a condition to become true, such as waiting for a network host to come online, a file to appear, or a process to start. Combined with **sleep**, it provides a simple way to implement retry logic in shell scripts.

The exit status of an until loop is the exit status of the last command executed in the body. If the body never executes because the condition is already true, the exit status is zero.

# CAVEATS

Shell builtin. Opposite of while. Condition evaluated each iteration.

# EXAMPLES

```
until ping -c1 host &>/dev/null; do
  echo "Waiting..."
  sleep 5
done
echo "Host is up"
```

# HISTORY

**until** is a standard shell control structure available in POSIX shells, opposite of the while loop.

# SEE ALSO

[while](/man/while)(1), [for](/man/for)(1), [if](/man/if)(1)
