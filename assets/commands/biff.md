# TLDR

**Enable mail notification** for the current terminal session

```biff y```

**Disable mail notification** for the current terminal session

```biff n```

**Display the current notification status**

```biff```

# SYNOPSIS

**biff** [**y** | **n**]

# DESCRIPTION

**biff** is a mail notification utility that informs you at the command line when new mail arrives during your terminal session. When enabled, it displays the sender, subject, and the first few lines of incoming messages along with a terminal beep.

The notification works asynchronously through the **comsat**(8) service. If comsat is not enabled on the system, biff will have no effect. For synchronous notification, use the **MAIL** variable in **sh**(1) or the **mail** variable in **csh**(1) instead.

A common practice is to include **biff y** in **~/.login** or **~/.profile** to enable notifications at each login.

# PARAMETERS

**y**
> Enable mail notification for the current terminal

**n**
> Disable mail notification for the current terminal

If no argument is given, biff displays the current notification status.

# CAVEATS

The **biff** command requires the **comsat**(8) daemon to be running on the system. Without it, mail notifications will not work.

Using **su**(1) can cause permission issues with biff due to terminal ownership remaining with the original user, resulting in "Permission denied" errors when changing notification status.

# HISTORY

The command is named after **Biff**, a dog belonging to one of the developers at the University of California, Berkeley during the development of **BSD 4.0** in the late 1970s. Biff was known for barking at the mail carrier, making the name a fitting choice for a mail notification utility.

# SEE ALSO

[mail](/man/mail)(1), [sh](/man/sh)(1), [csh](/man/csh)(1)
