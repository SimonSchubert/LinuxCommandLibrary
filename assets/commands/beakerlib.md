# TLDR

**Create a basic test script**

```rlJournalStart && rlPhaseStart FAIL "Setup" && rlRun "command" && rlPhaseEnd && rlJournalEnd```

**Run a command and assert success**

```rlRun "[command]" 0 "Command should succeed"```

**Run a command and expect failure**

```rlRun "[command]" 1 "Command should fail with exit code 1"```

**Assert a file exists**

```rlAssertExists [path/to/file]```

**Assert strings are equal**

```rlAssertEquals "Test value" "[actual]" "[expected]"```

**Log informational message**

```rlLog "Informational message"```

**Backup and restore a file**

```rlFileBackup [path/to/file] && rlRun "[modify file]" && rlFileRestore```

# SYNOPSIS

Test scripts source BeakerLib and use its functions:

```source /usr/share/beakerlib/beakerlib.sh```

# FUNCTIONS

**rlJournalStart**
> Initialize test journal; must be called first.

**rlJournalEnd**
> Finalize journal and generate report.

**rlPhaseStart** _type_ _name_
> Start a test phase (FAIL, WARN, or pass type).

**rlPhaseEnd**
> End the current test phase.

**rlRun** _command_ [_expected_exit_] [_comment_]
> Run command and check exit code.

**rlAssertEquals** _comment_ _value1_ _value2_
> Assert two values are equal.

**rlAssertExists** _path_
> Assert file or directory exists.

**rlAssertNotExists** _path_
> Assert file or directory does not exist.

**rlAssertGrep** _pattern_ _file_
> Assert pattern exists in file.

**rlLog** _message_
> Log an informational message.

**rlFileBackup** _file_...
> Backup files for later restoration.

**rlFileRestore**
> Restore previously backed up files.

**rlServiceStart** / **rlServiceStop**
> Start or stop a system service.

# DESCRIPTION

**BeakerLib** is a shell-level integration testing library used primarily for testing RPM packages and system components. It provides functions for organizing tests into phases, running commands with assertions, managing files and services, and generating structured test reports.

Tests are organized as journals containing phases. Each phase groups related assertions and logs. The library handles setup/cleanup, result collection, and report generation automatically.

BeakerLib is designed for the **Beaker** test framework used in Red Hat and Fedora quality assurance, but can be used standalone for any shell-based integration testing. Tests produce logs in multiple formats including HTML and JUnit XML.

# CAVEATS

BeakerLib is primarily designed for RHEL/Fedora ecosystem; availability varies on other distributions. The shell-based approach can be slower than compiled test frameworks. Complex assertions require multiple function calls. The library must be sourced at the start of each test script.

# HISTORY

BeakerLib was developed at **Red Hat** as part of the **Beaker** integration testing infrastructure, originally designed for testing RHEL packages and system components. It grew from internal tools in the **mid-2000s** and was open-sourced along with Beaker. The library continues to be maintained as part of Red Hat's quality engineering toolchain.

# SEE ALSO

[bats](/man/bats)(1), [shunit2](/man/shunit2)(1), [beaker](/man/beaker)(1)
