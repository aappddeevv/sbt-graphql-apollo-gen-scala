Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / version := "0.1.0"
ThisBuild / organization := "ttg"
ThisBuild / description := "Graphql code generator using apollo tools."
ThisBuild / licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

lazy val bintraySettings = Seq(
  bintrayRepository := "sbt-plugins",
  bintrayOrganization in bintray := None,
  bintrayReleaseOnPublish := false,
  bintrayPackageLabels := Seq("sbt", "graphql", "apollo", "scala.js", "code generator"),
  bintrayVcsUrl := Some("git:git@github.com:aappddeevv/sbt-graphql-apollo-gen-scala"),
  publishMavenStyle := false,
)

lazy val root = (project in file("."))
  .settings(
    sbtPlugin := true,
    name := "sbt-graphql-apollo-gen-scala",
    publishMavenStyle := false,
  )
  .settings(bintraySettings)
  .enablePlugins(GitVersioning)
