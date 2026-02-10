# TAGLINE

load testing tool for web applications

# TLDR

**Launch GUI**

```jmeter```

**Run test plan**

```jmeter -n -t [test.jmx]```

**Run with log output**

```jmeter -n -t [test.jmx] -l [results.jtl]```

**Generate HTML report**

```jmeter -n -t [test.jmx] -l [results.jtl] -e -o [report/]```

**Run with properties**

```jmeter -n -t [test.jmx] -J[threads=100]```

**Remote distributed test**

```jmeter -n -t [test.jmx] -R [server1,server2]```

# SYNOPSIS

**jmeter** [_options_]

# PARAMETERS

**-n**
> Non-GUI mode.

**-t** _FILE_
> Test plan file (.jmx).

**-l** _FILE_
> Log results file (.jtl).

**-e**
> Generate report after test.

**-o** _DIR_
> Report output directory.

**-J**_PROP=VALUE_
> Set property.

**-R** _SERVERS_
> Remote servers.

**--help**
> Display help information.

# DESCRIPTION

**JMeter** is a load testing tool for web applications. It simulates heavy loads on servers to test performance.

The tool supports HTTP, JDBC, FTP, and other protocols. It provides graphical test design and result analysis.

# CAVEATS

Java-based. Resource intensive for large tests. GUI for design, CLI for execution.

# HISTORY

Apache JMeter was created by **Stefano Mazzocchi** as a load testing tool, becoming a standard for web performance testing.

# SEE ALSO

[ab](/man/ab)(1), [siege](/man/siege)(1), [wrk](/man/wrk)(1), [k6](/man/k6)(1)
