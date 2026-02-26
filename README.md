# devOpsGate
# Part 1
```
C:\Users\hirwa>git config --global user.Gervais
C:\Users\hirwa>git config --global user.gervaisniyonshuti@gmail.com
```
# Part 2
```
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (main)
$ echo "# devOpsGate" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Gervais-NIYONSHUTI/devOpsGate.git
git push -u origin main
Reinitialized existing Git repository in D:/Cogito ergo sum/devOpsGate/.git/
warning: in the working copy of 'README.md', LF will be replaced by CRLF the next time Git touches it
[main (root-commit) 5da8a82] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 239 bytes | 239.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Gervais-NIYONSHUTI/devOpsGate.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (main)
$ git branch
* main
```
# Part 3
```
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (main)
$ git branch
* main

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (main)
$ git checkout -b dev
Switched to a new branch 'dev'
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (dev)
$ git push -u origin dev
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'dev' on GitHub by visiting:
remote:      https://github.com/Gervais-NIYONSHUTI/devOpsGate/pull/new/dev
remote:
To https://github.com/Gervais-NIYONSHUTI/devOpsGate.git
 * [new branch]      dev -> dev
branch 'dev' set up to track 'origin/dev'.

```
# Part 4
```
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (dev)
$ git checkout -b test
Switched to a new branch 'test'

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (test)
$ git push -u origin test
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'test' on GitHub by visiting:
remote:      https://github.com/Gervais-NIYONSHUTI/devOpsGate/pull/new/test
remote:
To https://github.com/Gervais-NIYONSHUTI/devOpsGate.git
 * [new branch]      test -> test
branch 'test' set up to track 'origin/test'.

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (test)
$ git log --oneline
5da8a82 (HEAD -> test, origin/test, origin/main, origin/dev, main, dev) first commit
gt
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (test)
$ git branch -a
  dev
  main
* test
  remotes/origin/dev
  remotes/origin/main
  remotes/origin/test

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (test)
$ git checkout dev
Switched to branch 'dev'
Your branch is up to date with 'origin/dev'.

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (dev)
$ git branch -d test
Deleted branch test (was 5da8a82).

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (dev)
$ git push origin --delete test
To https://github.com/Gervais-NIYONSHUTI/devOpsGate.git
 - [deleted]         test

```
# Part 5
```
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (dev)
$ git checkout -b ft/setup
Switched to a new branch 'ft/setup'
```
# Part 6
```
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git add test.java

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git commit -m "add hello world"
[ft/setup 8fd8a69] add hello world
 1 file changed, 4 insertions(+)
 create mode 100644 src/main/java/HelloWorld.java

```
# Part 7
```
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ echo "// Hello World!" >> test.java

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git stash push -m "add a hello world message"
warning: in the working copy of 'README.md', LF will be replaced by CRLF the next time Git touches it
Saved working directory and index state On ft/setup: add a hello world message

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git status
On branch ft/setup
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Test.java

nothing added to commit but untracked files present (use "git add" to track)
gt
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git stash list
stash@{0}: On ft/setup: add a hello world message

```
# Part 8
```
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git stash pop stash@{0}
On branch ft/setup
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   .idea/misc.xml
        modified:   README.md
        modified:   src/main/java/HelloWorld.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Test.java

no changes added to commit (use "git add" and/or "git commit -a")
Dropped stash@{0} (89e93257dc1133e0f3dda1504c04da5abd9df3ca)

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git diff
diff --git a/.idea/misc.xml b/.idea/misc.xml
index fdc35ea..65ff655 100644
--- a/.idea/misc.xml
+++ b/.idea/misc.xml
@@ -8,7 +8,7 @@
       </list>
     </option>
   </component>
-  <component name="ProjectRootManager" version="2" languageLevel="JDK_21" default="t
rue" project-jdk-name="21" project-jdk-type="JavaSDK">
+  <component name="ProjectRootManager" version="2" languageLevel="JDK_X" default="true" project-jdk-name="openjdk-25" project-jdk-type="JavaSDK">
     <output url="file://$PROJECT_DIR$/out" />
   </component>
 </project>
\ No newline at end of file
diff --git a/README.md b/README.md
index f393a93..713df61 100644
--- a/README.md
+++ b/README.md
@@ -1 +1,133 @@
 # devOpsGate
+# Part 1
+```
+C:\Users\hirwa>git config --global user.Gervais
+C:\Users\hirwa>git config --global user.gervaisniyonshuti@gmail.com
+```
+# Part 2
+```
+hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (main)
+$ echo "# devOpsGate" >> README.md
+git init
+git add README.md
+git commit -m "first commit"
+git branch -M main
+git remote add origin https://github.com/Gervais-NIYONSHUTI/devOpsGate.git
:

```
# Part 9
```
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git add .
warning: in the working copy of 'Test.java', LF will be replaced by CRLF the next time Git touches it

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git commit -m "restored stashed changes"
[ft/setup 4ccb3c3] restored stashed changes
 4 files changed, 222 insertions(+), 3 deletions(-)
 create mode 100644 Test.java

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git push -u origin ft/setup
Enumerating objects: 34, done.
Counting objects: 100% (34/34), done.
Delta compression using up to 4 threads
Compressing objects: 100% (23/23), done.
Writing objects: 100% (32/32), 5.57 KiB | 951.00 KiB/s, done.
Total 32 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), done.
remote:
remote: Create a pull request for 'ft/setup' on GitHub by visiting:
remote:      https://github.com/Gervais-NIYONSHUTI/devOpsGate/pull/new/ft/setup
remote:
To https://github.com/Gervais-NIYONSHUTI/devOpsGate.git
 * [new branch]      ft/setup -> ft/setup
branch 'ft/setup' set up to track 'origin/ft/setup'.
```
# Part 10
```
hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (main)
$ git add .

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (main)
$ git commit -m "morning rwanda"
[main 9b1a622] morning rwanda
 1 file changed, 1 insertion(+), 1 deletion(-)

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (main)
$ git push
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 306 bytes | 306.00 KiB/s, done.
Total 3 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
To https://github.com/Gervais-NIYONSHUTI/devOpsGate.git
   5da8a82..9b1a622  main -> main

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (main)
$ git switch ft/setup
Switched to branch 'ft/setup'
Your branch is up to date with 'origin/ft/setup'.

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git merge main
Updating 9cca790..9b1a622
Fast-forward
 Test.java | 2 +-
 1 file changed, 1 insertion(+), 1 deletion(-)

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git status
On branch ft/setup
Your branch is ahead of 'origin/ft/setup' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git commit -m "fix(merge): resolve conflict between main and ft/setup"
On branch ft/setup
Your branch is ahead of 'origin/ft/setup' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

hirwa@PC MINGW64 /d/Cogito ergo sum/devOpsGate (ft/setup)
$ git push
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Gervais-NIYONSHUTI/devOpsGate.git
   9cca790..9b1a622  ft/setup -> ft/setup
```













