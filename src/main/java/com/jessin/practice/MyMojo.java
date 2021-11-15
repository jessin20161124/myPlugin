package com.jessin.practice;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * https://www.cnblogs.com/oscar1987121/p/10959083.html
 */
@Mojo(name="hello",defaultPhase = LifecyclePhase.CLEAN)
public class MyMojo extends AbstractMojo
{


    @Parameter
    private String test;

    @Override
    public void execute() throws MojoExecutionException {
        System.out.println(" ---------->> Hello My Plugins = " + test);
    }
}
