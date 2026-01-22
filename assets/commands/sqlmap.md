# TLDR

**Test a URL for SQL injection**

```sqlmap -u "[https://example.com/page?id=1]"```

**Test with increased detection level**

```sqlmap -u "[url?id=1]" --level [5] --risk [3]```

**Enumerate databases**

```sqlmap -u "[url?id=1]" --dbs```

**Dump a specific table**

```sqlmap -u "[url?id=1]" -D [database] -T [table] --dump```

**Test POST request** with data

```sqlmap -u "[url]" --data="[username=admin&password=test]"```

**Load request from file** (captured from proxy)

```sqlmap -r [request.txt]```

**Get an OS shell** through SQL injection

```sqlmap -u "[url?id=1]" --os-shell```

**Run in batch mode** (no prompts)

```sqlmap -u "[url?id=1]" --batch```

# SYNOPSIS

**sqlmap** [_options_] -u _URL_

**sqlmap** [_options_] -r _REQUEST_FILE_

# PARAMETERS

**-u** _URL_
> Target URL with injectable parameter

**-r** _FILE_
> Load HTTP request from file

**--data** _DATA_
> POST data string

**--cookie** _COOKIE_
> HTTP Cookie header value

**-p** _PARAM_
> Testable parameter(s)

**--level** _LEVEL_
> Test thoroughness (1-5, default: 1)

**--risk** _RISK_
> Test risk level (1-3, default: 1)

**--technique** _TECH_
> Injection techniques (B, E, U, S, T, Q)

**--dbms** _DBMS_
> Force specific database type

**--dbs**
> Enumerate databases

**--tables**
> Enumerate tables

**--columns**
> Enumerate columns

**--dump**
> Dump table entries

**-D** _DB_
> Target database

**-T** _TABLE_
> Target table

**-C** _COLUMNS_
> Target columns

**--os-shell**
> Get interactive OS shell

**--os-cmd** _CMD_
> Execute OS command

**--batch**
> Non-interactive mode

**--threads** _NUM_
> Concurrent requests (default: 1)

**-v** _LEVEL_
> Verbosity level (0-6)

**--wizard**
> Interactive wizard for beginners

# DESCRIPTION

**sqlmap** is an automated SQL injection and database takeover tool. It detects and exploits SQL injection vulnerabilities in web applications, supporting a wide range of database systems including MySQL, PostgreSQL, Oracle, Microsoft SQL Server, and SQLite.

The tool uses various injection techniques: boolean-based blind, error-based, UNION query, stacked queries, time-based blind, and inline queries. It can enumerate databases, tables, columns, and dump data. Advanced features include OS access through database functions.

Detection levels (**--level**) control test thoroughness—higher levels test more injection points including cookies and headers. Risk levels (**--risk**) control whether potentially harmful tests (like heavy time delays) are used.

# CAVEATS

Only use with explicit authorization—unauthorized testing is illegal. High level/risk settings can cause false positives or server issues. Some injection types may modify database data. Web application firewalls may block or rate-limit requests. Results should be verified manually for accuracy.

# HISTORY

sqlmap was created by **Daniele Bellucci** and **Bernardo Damele A. G.** with development starting in **2006**. It became one of the most widely used penetration testing tools for SQL injection. The project is open-source, written in Python, and continues active development. sqlmap is included by default in Kali Linux and other security-focused distributions.

# SEE ALSO

[burpsuite](/man/burpsuite)(1), [nikto](/man/nikto)(1), [skipfish](/man/skipfish)(1), [wpscan](/man/wpscan)(1)
