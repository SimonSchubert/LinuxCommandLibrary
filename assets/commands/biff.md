# TAGLINE

Toggle mail arrival notification at the terminal

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

The command appeared in **4.0BSD** (released 1980), written by **John Foderaro** at the University of California, Berkeley. It is named after **Biff**, a dog belonging to fellow Berkeley student Heidi Stettner. The popular story that Biff barked at the mail carrier is disputed by Stettner herself, but the name stuck as a fitting choice for a mail notification utility.

On modern systems the notification daemon is part of **GNU inetutils** (as in.comsat), and the biff client typically ships in a dedicated **biff** package on Debian and Ubuntu.

# INSTALL

```apt: sudo apt install biff```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[mail](/man/mail)(1), [sh](/man/sh)(1), [csh](/man/csh)(1)

# RESOURCES

```[Homepage](https://www.gnu.org/software/inetutils/)```

<!-- verified: 2026-06-19 -->
